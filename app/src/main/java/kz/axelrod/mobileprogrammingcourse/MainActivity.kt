package kz.axelrod.mobileprogrammingcourse

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FeedAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerViewFeed)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val posts = listOf(
            Post(R.drawable.sample_image_1, "Grüezi"),
            Post(R.drawable.sample_image_2, "First successful experience of carving"),
        )
        adapter = FeedAdapter(posts)
        recyclerView.adapter = adapter
    }
}
