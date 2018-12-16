package com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.nastia.administrator.daily_advice_app.R
import com.nastia.administrator.daily_advice_app.databinding.ActivityFavoriteAdviceBinding
import com.nastia.administrator.daily_advice_app.presentation.base.BaseMvvmActivity

class FavoriteAdviceActivity :
    BaseMvvmActivity<FavoriteAdviceViewModel, FavoriteAdviceRouter, ActivityFavoriteAdviceBinding>() {

    override fun provideViewModel(): FavoriteAdviceViewModel {
        return ViewModelProviders.of(this).get(FavoriteAdviceViewModel::class.java)
    }

    override fun provideRouter(): FavoriteAdviceRouter = FavoriteAdviceRouter(this)

    override fun provideLayoutId(): Int = R.layout.activity_favorite_advice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = viewModel.adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(binding.recyclerView.context)
    }
}