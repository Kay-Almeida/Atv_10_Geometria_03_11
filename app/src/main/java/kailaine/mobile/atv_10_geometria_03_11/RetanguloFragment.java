package kailaine.mobile.atv_10_geometria_03_11;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kailaine.mobile.atv_10_geometria_03_11.controller.GeometriaRetangulo;
import kailaine.mobile.atv_10_geometria_03_11.controller.IGeometriaController;
import kailaine.mobile.atv_10_geometria_03_11.model.Retangulo;


public class RetanguloFragment extends Fragment {

    private View view;
    private EditText etAlturaRet,etLarguraRet;
    private TextView tvResultadoRET;
    private Button btnCalcularRet, btnCalcularAreaRET;

    public RetanguloFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);
        etAlturaRet = view.findViewById(R.id.etAlturaRet);
        etLarguraRet = view.findViewById(R.id.etLarguraRet);
        tvResultadoRET = view.findViewById(R.id.tvResultadoRET);
        btnCalcularRet = view.findViewById(R.id.btnCalcularRet);
        btnCalcularAreaRET = view.findViewById(R.id.btnCalcularAreaRET);
        btnCalcularRet.setOnClickListener(op-> calculoperimetro());
        btnCalcularAreaRET.setOnClickListener(op->calculoArea());
        return view;
    }

    private void calculoperimetro() {
        try {
            float altura = Float.parseFloat(etAlturaRet.getText().toString());
            float largura = Float.parseFloat(etLarguraRet.getText().toString());
            Retangulo retangulo = new Retangulo();
            retangulo.setAltura(altura);
            retangulo.setBase(largura);

            IGeometriaController<Retangulo> retanguloController = new GeometriaRetangulo();
            float perimetro = retanguloController.calcularPerimetro(retangulo);

            tvResultadoRET.setText("Perímetro: " + perimetro);
            limparCampos();
        } catch (NumberFormatException e) {
            tvResultadoRET.setText("Por favor, insira valores válidos para altura e largura.");
        }
    }


    private void calculoArea() {
        try {
            float altura = Float.parseFloat(etAlturaRet.getText().toString());
            float largura = Float.parseFloat(etLarguraRet.getText().toString());
            Retangulo retangulo = new Retangulo();
            retangulo.setAltura(altura);
            retangulo.setBase(largura);

            IGeometriaController<Retangulo> retanguloController = new GeometriaRetangulo();
            float area = retanguloController.calcularArea(retangulo);

            tvResultadoRET.setText("Área: " + area);
            limparCampos();
        } catch (NumberFormatException e) {
            tvResultadoRET.setText("Por favor, insira valores válidos para altura e largura.");
        }
    }
    private void limparCampos() {
        etAlturaRet.setText("");
        etLarguraRet.setText("");
    }
}