package com.rival.listbuah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var namaBuah =
            arrayOf("alpukat", "apel", "ceri", "durian", "jambuair", "manggis", "strawberry")
        var imgBuah = arrayOf(
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry,
        )

        var suaraBuah = arrayOf(
            R.raw.alpukat,
            R.raw.apel,
            R.raw.ceri,
            R.raw.durian,
            R.raw.jambu_air,
            R.raw.manggis,
            R.raw.strawberry
        )

        val buahAdapter = BuahAdapter(namaBuah, imgBuah, suaraBuah)

        rv_buah.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = buahAdapter
        }
    }
}