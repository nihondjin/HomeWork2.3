package com.timmland.android23.ui.adapters
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timmland.android23.databinding.ItemOnBoardBinding
import com.timmland.android23.room.model.NoteModel


class OnBoardViewPagerAdapter(val onItemClick: (position: Int) -> Unit) :
    RecyclerView.Adapter<OnBoardViewPagerAdapter.ViewPagerViewHolder>() {

    var list: ArrayList<NoteModel> = arrayListOf()

    inner class ViewPagerViewHolder(val binding: ItemOnBoardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: NoteModel) {
            binding.tvStart.text = model.title
         //   binding.txView.text = model.description
            binding.lottieAnimation.setAnimation(model.image)
            binding.tvStart.setOnClickListener {
                onItemClick(layoutPosition)
            }
        }
    }

    fun setData(list: ArrayList<NoteModel>) {
        this.list = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val binding = ItemOnBoardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}