package com.example.experiment

import android.R.attr.button
import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {

    private lateinit var textView1: TextView
    private lateinit var textBTN1: Button
    private lateinit var textView2: TextView
    private lateinit var textBTN2: Button
    private lateinit var textView3: TextView
    private lateinit var textBTN3: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textView1 = findViewById<TextView>(R.id.textView1) as TextView
        textBTN1 = findViewById<Button>(R.id.textBTN1) as Button
        textBTN1.setOnClickListener {
            textView1.text = "Получишь результат"
        }
        textView2 = findViewById<TextView>(R.id.textView2) as TextView
        textBTN2 = findViewById<Button>(R.id.textBTN2)
        textBTN2.setOnClickListener {
            textView2.text = "И твоя мечта осуществится"
        }
        textView3 = findViewById<TextView>(R.id.textView3) as TextView
        textBTN3 = findViewById<Button>(R.id.textBTN3)
        textBTN3.setOnClickListener {
            textView3.text =
                "Ну чтоже ты не рад?"
        }
        savedInstanceState?.let {
            textView1.text = it.getString("text", "")
            textView2.text = it.getString("text1", "")
            textView3.text = it.getString("text2", "")
        }
        val tableLayout = findViewById<TableLayout>(R.id.tableLayout)
        tableLayout.addView(TableRow(this))
        val addBTN = findViewById<Button>(R.id.addBTN) as Button
        addBTN.setOnClickListener {
            val tableRow = TableRow(this)
            val layoutParams = TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.layoutParams = layoutParams //описание представления
            val textView = TextView(this)
            textView.setTextColor(Color.WHITE)
            textView.setTextSize(16F)
            textView.text = "Тебе больше не к чему стремиться..."
            textView.setPadding(20, 20, 20, 20)
            tableRow.addView(textView)
            tableLayout.addView(tableRow)
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.run {
            putString("text", textView1.text.toString())
            putString("text1", textView2.text.toString())
            putString("text2", textView3.text.toString())
        }
    }
}
//    override fun onCreateContextMenu(
//        menu: ContextMenu?,
//        v: View,
//        menuInfo: ContextMenu.ContextMenuInfo?) {
//        super.onCreateContextMenu(menu, v, menuInfo)
//        menuInflater.inflate(R.menu.exit_menu, menu)
//    }
//}
//        val exitBTN: Button = findViewById<Button>(R.id.exitBTN) as Button
//        exitBTN.setOnClickListener {finish()}


//val data = listOf("Row 1", "Row 2")
////
////            for (item in data) {
//val tableRow = TableRow(this)
//val layoutParams = TableRow.LayoutParams(
//    TableRow.LayoutParams.MATCH_PARENT,
//    TableRow.LayoutParams.WRAP_CONTENT
//)
//tableRow.layoutParams = layoutParams
//val textView = TextView(this )
//textView.setTextColor(Color.WHITE)
//textView.text = "Тебе больше не к чему стремиться?"
//textView.setPadding(20,20,20,20)
//tableRow.addView(textView)
//tableLayout.addView(tableRow)



// val btnChangeText = findViewById(R.id.btn_change_text) as Button
      //  val tvHello = findViewById(R.id.tv_hello) as TextView
      //  btnChangeText.setOnClickListener { tvHello.text="Yay! I am a Kotlin expert"; }
    //}
//Часть 2: TableLayout
//Создайте новый XML-файл activity_table.xml.
//Добавьте TableLayout с 3 строками и 2 столбцами.
//В каждой строке разместите текст (TextView) и кнопку (Button).
//При нажатии на кнопку в строке, изменяйте текст TextView в этой же строке.
//
//Дополнительное задание:
//Попробуйте сделать динамическое добавление строк в TableLayout по нажатию кнопки.