package com.akirachix.reader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.reader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)
        displayBlogs()
    }

    fun displayBlogs() {
        val blog1 = Blog("Wato Bucha", "", "Women In Tech", "10/05/2024", "From the earliest stone advances in artificial intelligence has continuously transformed our lives.", "")
        val blog2 = Blog("Galgallo Bucha", "", "East of Eden", "28/08/2024", "Republican lawmakers, right-wing media outlets and influencers, and Trump himself are pushing conspiracies about Biden's health and the debate in general.", "")
        val blog3 = Blog("Kame Bashuna", "", "Sunrise", "3/01/2022", "There are many scary claims about excess time on digital devices for children and teenagers. ", "")
        val blog4 = Blog("Boru j", "", "Brave New World ", "19/03/2021", "From the earliest stone advances in artificial intelligence has continuously transformed our lives.", "")
        val blog5 = Blog("Adano Bucha", "", "Agriculture ", "1/04/2023", "Republican lawmakers, right-wing media outlets and influencers, and Trump himself are pushing conspiracies about Biden's health and the debate in general.", "")
        val blog6 = Blog("Trevor Noah", "", "The Man Who Was Thursday", "20/11/2022", "There are many scary claims about excess time on digital devices for children and teenagers. ", "")
        val blog7 = Blog("Susan Odongo", "", "Keep Your Mind Active", "12/05/2024", "From the earliest stone advances in artificial intelligence has continuously transformed our lives.", "")
        val blog8 = Blog("Mary", "", "Beauty of AI", "02/04/2024", "", "")
        val blog9 = Blog("Jane Kibara", "", "Tech For Environment", "18/05/2024", "There are many scary claims about excess time on digital devices for children and teenagers. ", "")
        val blog10 = Blog("Agnes Auma", "", "Love More", "05/09/2026", "From the earliest stone advances in artificial intelligence has continuously transformed our lives.", "")

        val blogList = listOf(blog1, blog2, blog3, blog4, blog5, blog6, blog7, blog8, blog9, blog10)
        val blogAdapter = BlogsAdapter(blogList)
        binding.rvBlogs.adapter = blogAdapter

    }
}
