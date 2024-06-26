package com.vetion.capstoneproject.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vetion.capstoneproject.R
import com.vetion.capstoneproject.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var progressBar1: ProgressBar
    private lateinit var progressBar2: ProgressBar
    private lateinit var progressBar3: ProgressBar
    private lateinit var progressBar4: ProgressBar
    private lateinit var progressBar5: ProgressBar

    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView
    private lateinit var imageView4: ImageView
    private lateinit var imageNews: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        // Initialize ProgressBar and ImageView references
        progressBar1 = rootView.findViewById(R.id.progress_bar)
        progressBar2 = rootView.findViewById(R.id.progress_bar2)
        progressBar3 = rootView.findViewById(R.id.progress_bar3)
        progressBar4 = rootView.findViewById(R.id.progress_bar4)
        progressBar5 = rootView.findViewById(R.id.progress_bar5)

        imageView1 = rootView.findViewById(R.id.imageView)
        imageView2 = rootView.findViewById(R.id.imageView2)
        imageView3 = rootView.findViewById(R.id.imageView3)
        imageView4 = rootView.findViewById(R.id.imageView4)
        imageNews = rootView.findViewById(R.id.imageNews)

        // Load data or perform actions to display images and hide progress bars when data is ready
        loadData()

        return rootView
    }

    private fun loadData() {
        // Simulate loading data with a delay
        // This is just a placeholder. Replace it with actual data loading logic.
        progressBar1.visibility = View.GONE
        imageView1.setImageResource(R.drawable.images) // Replace with actual image resource or data

        progressBar2.visibility = View.GONE
        imageView2.setImageResource(R.drawable.img1) // Replace with actual image resource or data

        progressBar3.visibility = View.GONE
        imageView3.setImageResource(R.drawable.img1) // Replace with actual image resource or data

        progressBar4.visibility = View.GONE
        imageView4.setImageResource(R.drawable.img1) // Replace with actual image resource or data

        progressBar5.visibility = View.GONE
        imageNews.setImageResource(R.drawable.images) // Replace with actual image resource or data
    }
}