### Singleton_Class_Kotlin

#### What is Singleton class?

The purpose of the Singleton class is to control object creation, limiting the number of objects to only one. The singleton allows only one entry point to create the new instance of the class

#### Benefits

In a typical Android app, there are many objects for which we only need one global instance, whether you are using it directly or simply passing it to another class. Examples include caches, OkHttpClient, HttpLoggingInterceptor, Retrofit, Gson, SharedPreferences, the repository class, etc. If we were to instantiate more than one of these types of objects, we'd run into problems like incorrect app behaviour, resource overuse, and other confusing results.

 In Kotlin, A singleton is created by simply declaring an object.

```
object MySingleton
{
	init
	{
		// Do something.
	}
}

```
#### Key Points:

- Kotlin’s representation of a Singleton class requires the object keyword only.
- An object class can contain properties, functions and the init method.
- The constructor method is NOT allowed.
- An object cannot be instantiated in the way a class is instantiated.
- An object gets instantiated when it is used for the first time providing lazy initialization.
- Object declaration’s initialization is thread-safe.
