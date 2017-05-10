package andy.ham;

import android.app.Activity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class DialogAlert extends Activity {

	/** Called when the activity is first created. */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Builder dialog = new AlertDialog.Builder(DialogAlert.this);
		dialog.setIcon(android.R.drawable.ic_dialog_info);
		dialog.setTitle("欢迎");
		dialog.setMessage("66666");
		dialog.setPositiveButton("肯定", new OnClickListener() {
			public void onClick(DialogInterface a0, int a1) {
				
			}
		});
		dialog.setNegativeButton("否定", new OnClickListener() {
			public void onClick(DialogInterface a0, int a1) {
			
			}
		});
		dialog.create();
		dialog.show();
	}
}
