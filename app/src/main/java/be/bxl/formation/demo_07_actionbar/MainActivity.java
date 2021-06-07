package be.bxl.formation.demo_07_actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récuperation de la toobar du layout
        Toolbar toolbar = findViewById(R.id.app_toolbar);

        // Défini la toolbar pour l'activité
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Ajout du menu dans l'activité
        // => Cela l'ajoute dans la toolbar
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Ajout des réactions lors de l'utilisation du menu de la toolbar
        switch (item.getItemId()) {
            case R.id.toolbar_action_1:
                Toast.makeText(this, "Test 1", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.toolbar_action_2:
                Toast.makeText(this, "Test 2", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.toolbar_action_3:
                Toast.makeText(this, "Test 3", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.toolbar_action_4:
                Toast.makeText(this, "Test 4", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return  super.onOptionsItemSelected(item);
        }
    }
}