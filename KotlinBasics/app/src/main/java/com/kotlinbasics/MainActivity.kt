package com.kotlinbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasics.ui.theme.KotlinBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        week02Variables()
        week02Functions()
    }
}

private fun week02Variables() {
//    println("=== Week 2: Variables ===")
//
//    val courseName = "Mobile Programming"
//    var week = 2
//
//    println("Course: $courseName")
//    println("Week: $week")

    // 변수 선언과 타입
    println("=== Kotlin Variables ===")

    // val (불변) vs var (가변)
    val name = "Android"
    var version = 14
    println("Hello $name $version")

    // 타입 명시
    val age: Int = 25
    val height: Double = 175.5
    val isStudent: Boolean = true

    println("Age: $age, Height: $height, Student: $isStudent")

    // 널 허용 타입
    var nickname: String? = null
    nickname = "Kim"
    println("Nickname: ${nickname?.length}")
}

private fun week02Functions() {
    println("=== Week 2: Functions ===")

    fun greet(name: String) = "Hello, $name!"

    println(greet("Android Developer"))
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsTheme {
        Greeting("Android")
    }
}