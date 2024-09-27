package kz.axelrod.mobileprogrammingcourse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Data class for Feed
data class Post(val imageRes: Int, val caption: String)

// Adapter class for RecyclerView
class FeedAdapter(private val posts: List<Post>) : RecyclerView.Adapter<FeedAdapter.FeedViewHolder>() {

    // ViewHolder class for handling individual post views
    class FeedViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val postImage: ImageView = view.findViewById(R.id.postImage)
        val postCaption: TextView = view.findViewById(R.id.postCaption)
    }

    // Inflate the item layout for each post
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return FeedViewHolder(view)
    }

    // Bind data to the view holder
    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        val post = posts[position]
        holder.postImage.setImageResource(post.imageRes)
        holder.postCaption.text = post.caption
    }

    override fun getItemCount() = posts.size
}
