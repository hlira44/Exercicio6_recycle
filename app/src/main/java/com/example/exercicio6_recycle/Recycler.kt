import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicio6_recycle.R
import com.example.exercicio6_recycle.dataclass.Place

class RecyclerActivity : AppCompatActivity() {

    // Declarando a lista como lateinit
    private lateinit var myList: ArrayList<Place>

    // Sobrescrevendo o método onCreate dentro da classe
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Definindo o layout da activity

        // Inicializando a lista
        myList = ArrayList()

    }
}
