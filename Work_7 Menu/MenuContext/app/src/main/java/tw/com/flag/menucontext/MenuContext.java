package tw.com.flag.menucontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;
public class MenuContext extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_context);
        TextView tv = new TextView(this);
        tv.setText("上下文菜单的载体");
        registerForContextMenu(tv);
        setContentView(tv);
    }
    public boolean onContextItemSelected(MenuItem item) {
        super.onContextItemSelected(item);
        switch (item.getItemId()) {
            case 1:
                break;
            case 2:
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenuInfo menuInfo) {
        menu.add(0, 1, 1, R.string.newf);
        menu.add(0, 2, 2, R.string.open);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}
