package com.example.test1.community

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test1.R
import kotlinx.android.synthetic.main.activity_community.*

class CommunityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community)



        // RecyclerView
        rv_community.adapter = CommunityAdapter()
        rv_community.layoutManager = LinearLayoutManager(this)
    }
}
