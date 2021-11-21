package com.example.recyclercard.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Cards(@StringRes val stringResourceId: Int,
                 @DrawableRes val imageResourceId: Int) {
}