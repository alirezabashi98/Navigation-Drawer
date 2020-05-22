package arb.test.navigation.drawer.activity.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "GitHub.com/alirezsbashi"
    }
    val text: LiveData<String> = _text
}