# ViewBinding with Kotlin Delegated Properties

With viewbinding enabled, We still need a few lines of code to get the ViewBinding object and hold it in Fragment/Activity.

With the help of this extension, you can get the ViewBinding object with just one line of code.

## Getting started

The old way

```kotlin

class MainActivity : AppCompatActivity {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstaceState)
        binding = ActivityMainBinding.inflater(inflaterlayout)
        setContentView(binding.root)
    }
}
```

The new way

```kotlin

class MainActivity : AppCompatActivity {
    
    private val binding: ActivityMainBinding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstaceState: Bundle?) {
        super.onCreate(savedInstaceState)
        setContentView(binding.root)
    }
}