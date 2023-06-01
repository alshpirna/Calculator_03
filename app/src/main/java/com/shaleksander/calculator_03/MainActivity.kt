package com.shaleksander.calculator_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.ezylang.evalex.Expression
import com.shaleksander.calculator_03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val numberStringBuilder = StringBuilder()

        binding.zeroButton.setOnClickListener {
            numberStringBuilder.append(0)
            binding.resultTextView.text = numberStringBuilder
        }

        binding.oneButton.setOnClickListener {
            numberStringBuilder.append(1)
            binding.resultTextView.text = numberStringBuilder
        }
        binding.twoButton.setOnClickListener {
            numberStringBuilder.append(2)
            binding.resultTextView.text = numberStringBuilder
        }
        binding.threeButton.setOnClickListener {
            numberStringBuilder.append(3)
            binding.resultTextView.text = numberStringBuilder
        }
        binding.fourButton.setOnClickListener {
            numberStringBuilder.append(4)
            binding.resultTextView.text = numberStringBuilder
        }
        binding.fiveButton.setOnClickListener {
            numberStringBuilder.append(5)
            binding.resultTextView.text = numberStringBuilder
        }
        binding.sixButton.setOnClickListener {
            numberStringBuilder.append(6)
            binding.resultTextView.text = numberStringBuilder
        }
        binding.sevenButton.setOnClickListener {
            numberStringBuilder.append(7)
            binding.resultTextView.text = numberStringBuilder
        }
        binding.eigthButton.setOnClickListener {
            numberStringBuilder.append(8)
            binding.resultTextView.text = numberStringBuilder
        }
        binding.nineButton.setOnClickListener {
            numberStringBuilder.append(9)
            binding.resultTextView.text = numberStringBuilder
        }
        binding.plusButton.setOnClickListener {
            numberStringBuilder.append("+")
            binding.resultTextView.text = numberStringBuilder
        }
        binding.minusButton.setOnClickListener {
            numberStringBuilder.append("-")
            binding.resultTextView.text = numberStringBuilder
        }
        binding.multiplyButton.setOnClickListener {
            numberStringBuilder.append("*")
            binding.resultTextView.text = numberStringBuilder
        }
        binding.divideButton.setOnClickListener {
            numberStringBuilder.append("/")
            binding.resultTextView.text = numberStringBuilder
        }
        binding.pointButton.setOnClickListener {
            numberStringBuilder.append(".")
            binding.resultTextView.text = numberStringBuilder
        }

        binding.clearButton.setOnClickListener {
            binding.resultTextView.text = "0"
            numberStringBuilder.clear()
        }
        binding.delButton.setOnClickListener {
            numberStringBuilder.deleteCharAt(numberStringBuilder.length - 1)
            binding.resultTextView.text = numberStringBuilder
        }


        binding.equalButton.setOnClickListener {

            try {
                val stringExpr = numberStringBuilder.toString()
                val expression = Expression(stringExpr)
                val result = expression.evaluate().numberValue
                binding.resultTextView.text = result.toString()
                numberStringBuilder.clear()
                numberStringBuilder.append(result.toString())
            }catch (t: Throwable){
                Toast.makeText(this@MainActivity, "Exception: $t", Toast.LENGTH_LONG).show()
            }
        }




    }

}












































