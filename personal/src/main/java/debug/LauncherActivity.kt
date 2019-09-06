package debug

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.itwanyan.personal.PersonInfoActivity

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this,PersonInfoActivity::class.java)
        startActivity(intent)
        finish()
    }

}
