package neveen.afifi.taskmanageractivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class TaskMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_main);
    }


    //1. build xml menu
    //2. override next method
// 2.1 start write method name
    //2.2 remove return line
    //2.3 add:       getMenuInflater().inflate(R.menu.main_menu,menu);
    //                                      ** first parameter is our menu the second is the method parameter
    //2.4 add: return true;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main_menu,menu);
      return true;
    }

    //3.1 override (onOptionsItemSelected )select item event handler:معالجة حدث اختيار ال ITEM
    //3.2 chage to return true
// add before the return:
    /*
    if(item.getItemId()==R.id.itmSettings)
        {
            Intent i=new Intent(TaskMainActivity.this,SettingsActivity.class);
            startActivity(i);
        }///////
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.itmSettings)
        {
            Intent i=new Intent(TaskMainActivity.this,SettingsActivity.class);
            startActivity(i);
        }

        return true;

    }
}