package dae.screenutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dae.screenutils.library.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phone.text = getString(R.string.isPhone, if(this.isPhone()) "✓" else "✕")
        tablet.text = getString(R.string.isTablet, if(this.isTablet()) "✓" else "✕")
        tv.text = getString(R.string.isTV, if(this.isTV()) "✓" else "✕")
        small.text = getString(R.string.isSmall, if(this.isSmall()) "✓" else "✕")
        large.text = getString(R.string.isLarge, if(this.isLarge()) "✓" else "✕")
    }
}
