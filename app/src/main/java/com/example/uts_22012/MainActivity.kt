package com.example.uts_22012

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var spinnerYear: Spinner
    private lateinit var spinnerHour: Spinner
    private lateinit var spinnerMinute: Spinner
    private lateinit var buttonOk: Button
    private lateinit var radioGroupAge: RadioGroup
    private lateinit var checkboxThriller: CheckBox
    private lateinit var checkboxHorror: CheckBox
    private lateinit var checkboxAction: CheckBox
    private lateinit var checkboxRomance: CheckBox
    private lateinit var checkboxComedy: CheckBox
    private lateinit var checkboxFantasy: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerYear = findViewById(R.id.spinnerYear)
        spinnerHour = findViewById(R.id.spinnerHour)
        spinnerMinute = findViewById(R.id.spinnerMinute)
        buttonOk = findViewById(R.id.buttonOk)
        radioGroupAge = findViewById(R.id.radioGroupAge)
        checkboxThriller = findViewById(R.id.checkboxThriller)
        checkboxHorror = findViewById(R.id.checkboxHorror)
        checkboxAction = findViewById(R.id.checkboxAction)
        checkboxRomance = findViewById(R.id.checkboxRomance)
        checkboxComedy = findViewById(R.id.checkboxComedy)
        checkboxFantasy = findViewById(R.id.checkboxFantasy)

        buttonOk.setOnClickListener {
            val selectedYear = spinnerYear.selectedItem.toString()
            val selectedHour = spinnerHour.selectedItem.toString()
            val selectedMinute = spinnerMinute.selectedItem.toString()

            val selectedRadioButtonId = radioGroupAge.checkedRadioButtonId
            val radioButton: RadioButton = findViewById(selectedRadioButtonId)
            val selectedWatchFor = radioButton.text.toString()

            val genres = mutableListOf<String>()
            if (checkboxThriller.isChecked) genres.add("Thriller")
            if (checkboxHorror.isChecked) genres.add("Horror")
            if (checkboxAction.isChecked) genres.add("Action")
            if (checkboxRomance.isChecked) genres.add("Romance")
            if (checkboxComedy.isChecked) genres.add("Comedy")
            if (checkboxFantasy.isChecked) genres.add("Fantasy")

            val moveIntent = Intent(this@MainActivity, MainActivity2::class.java)
            moveIntent.putExtra("YEAR", selectedYear)
            moveIntent.putExtra("HOUR", selectedHour)
            moveIntent.putExtra("MINUTE", selectedMinute)
            moveIntent.putExtra("WATCH_FOR", selectedWatchFor)
            moveIntent.putExtra("GENRES", genres.joinToString(", "))

            startActivity(intent)
        }
    }
}
