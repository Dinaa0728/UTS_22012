package com.example.uts_22012

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
     lateinit var textViewTitle: TextView
     lateinit var textViewWatchFor: TextView
     lateinit var textViewGenre: TextView
     lateinit var textViewYear: TextView
     lateinit var textViewHour: TextView
     lateinit var textViewMinute: TextView

    companion object {
        const val EXTRA_TITLE = "EXTRA_TITLE"
        const val EXTRA_WATCH_FOR = "EXTRA_WATCH_FOR"
        const val EXTRA_GENRE = "EXTRA_GENRE"
        const val EXTRA_YEAR = "EXTRA_YEAR"
        const val EXTRA_HOUR = "EXTRA_HOUR"
        const val EXTRA_MINUTE = "EXTRA_MINUTE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textViewTitle = findViewById(R.id.textViewTitle)
        textViewWatchFor = findViewById(R.id.textViewWatchFor)
        textViewGenre = findViewById(R.id.textViewGenre)
        textViewYear = findViewById(R.id.textViewYear)
        textViewHour = findViewById(R.id.textViewHour)
        textViewMinute = findViewById(R.id.textViewMinute)

        // Get data from intent
        val title = intent.getStringExtra(EXTRA_TITLE)
        val watchFor = intent.getStringExtra(EXTRA_WATCH_FOR)
        val genre = intent.getStringExtra(EXTRA_GENRE)
        val year = intent.getStringExtra(EXTRA_YEAR)
        val hour = intent.getStringExtra(EXTRA_HOUR)
        val minute = intent.getStringExtra(EXTRA_MINUTE)

        // Set data to TextViews
        textViewTitle.text = title
        textViewWatchFor.text = watchFor
        textViewGenre.text = genre
        textViewYear.text = year
        textViewHour.text = hour
        textViewMinute.text = minute
    }
}
