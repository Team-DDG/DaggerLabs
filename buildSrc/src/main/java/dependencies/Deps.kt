package dependencies

object Deps {
    object Kotlin {
        private const val version = "1.3.71"
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
        const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.6"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:1.1.0"
        const val coreKtx = "androidx.core:core-ktx:1.2.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"

        object Lifecycle {
            private const val version = "2.3.0-alpha02"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.0-alpha02"
            const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-alpha02"
        }
    }

    object Dagger {
        private const val version = "2.27"
        const val dagger = "com.google.dagger:dagger:$version"
        const val compiler = "com.google.dagger:dagger-compiler:$version"
    }

    object Retrofit {
        private const val version = "2.7.1"
        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val gson = "com.squareup.retrofit2:converter-gson:$version"
    }
}