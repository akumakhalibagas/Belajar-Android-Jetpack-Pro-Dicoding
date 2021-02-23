package com.makhalibagas.academy.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.makhalibagas.academy.R
import com.makhalibagas.academy.databinding.ActivityDetailCourseBinding
import com.makhalibagas.academy.databinding.ContentDetailCourseBinding

class DetailCourseActivity : AppCompatActivity() {

    private lateinit var detailContentBinding : ContentDetailCourseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_course)

        val activityDetailCourseBinding = ActivityDetailCourseBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailCourseBinding.detailContent

        setContentView(activityDetailCourseBinding.root)

        setSupportActionBar(activityDetailCourseBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}