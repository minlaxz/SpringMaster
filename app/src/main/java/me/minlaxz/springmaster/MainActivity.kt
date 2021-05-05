package me.minlaxz.springmaster


import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkButton : Button = findViewById(R.id.checkButton)
        val firstCpuResult : TextView = findViewById(R.id.firstCpuTextView)
        val secondCpuResult : TextView = findViewById(R.id.secondCpuTextView)
        val thirdCpuResult : TextView = findViewById(R.id.thirdCpuTextView)

//        val arch = System.getProperty("os.arch")
//        val toast = Toast.makeText(this, 'Text', Toast.LENGTH_SHORT)
//        val abi = Build.SUPPORTED_ABIS[0]

        checkButton.setOnClickListener {
//            toast.show()
            println(Arrays.toString(Build.SUPPORTED_ABIS))
            firstCpuResult.text = "First Class CPU (preferred) : ${Build.SUPPORTED_ABIS[0]}"
            secondCpuResult.text = "Second Class CPU : ${Build.SUPPORTED_ABIS[1]}"
            thirdCpuResult.text = "Third Class CPU : ${Build.SUPPORTED_ABIS[2]}"

        }
    }
}
