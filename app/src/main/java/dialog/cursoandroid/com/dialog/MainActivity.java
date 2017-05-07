package dialog.cursoandroid.com.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private Button botao;
     private AlertDialog.Builder diaglog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //criar alert dialog
                diaglog = new AlertDialog.Builder( MainActivity.this );

                //configurar o titulo
                diaglog.setTitle("Titulo da diaglo");

                //configurar a mensagem;
                diaglog.setMessage("Mensagem");

                diaglog.setCancelable(false);
                diaglog.setIcon(android.R.drawable.ic_delete);

                //botao negativo
                diaglog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Botão Não pressionado", Toast.LENGTH_SHORT).show();
                            }
                        });

                //botao positivo
                diaglog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Botão Sim pressionado", Toast.LENGTH_SHORT).show();
                            }
                        });

                diaglog.create();

                diaglog.show();


            }
        });
    }
}
