package singleton.implementation

class SingletonClass private constructor(){
    companion object {
        val instance = SingletonClass()
    }

    init {
        println("Class Instantiated")
    }
}