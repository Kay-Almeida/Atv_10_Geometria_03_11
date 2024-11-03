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

import kailaine.mobile.atv_10_geometria_03_11.controller.GeometriaCirculo;
import kailaine.mobile.atv_10_geometria_03_11.controller.IGeometriaController;
import kailaine.mobile.atv_10_geometria_03_11.model.Circulo;


public class CirculoFragment extends Fragment {

    private View view;
    private EditText etRaioCirculo;
    private TextView tvResultadoCir;
    private Button btnCalcularCir, btnCalcularAreaCirculo;

    public CirculoFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_circulo, container, false);
        etRaioCirculo = view.findViewById(R.id.etRaioCirculo);
        tvResultadoCir = view.findViewById(R.id.tvResultadoCir);
        btnCalcularCir = view.findViewById(R.id.btnCalcularCir);
        btnCalcularAreaCirculo = view.findViewById(R.id.btnCalcularAreaCirculo);
        btnCalcularCir.setOnClickListener(op-> calculoperimetroCirculo());
        btnCalcularAreaCirculo.setOnClickListener(op-> calculoAreaCirculo());
        return view;
    }

    private void calculoAreaCirculo() {
        try {
            float raio = Float.parseFloat(etRaioCirculo.getText().toString());
            Circulo circulo = new Circulo();
            circulo.setRaio(raio);

            IGeometriaController<Circulo> circuloController = new GeometriaCirculo();
            float area = circuloController.calcularArea(circulo);

            tvResultadoCir.setText("Área: " + area);
            limparCampos();
        } catch (NumberFormatException e) {
            tvResultadoCir.setText("Por favor, insira um valor válido para o raio.");
        }
    }

    private void calculoperimetroCirculo() {
        try {
            float raio = Float.parseFloat(etRaioCirculo.getText().toString());
            Circulo circulo = new Circulo();
            circulo.setRaio(raio);

            IGeometriaController<Circulo> circuloController = new GeometriaCirculo();
            float perimetro = circuloController.calcularPerimetro(circulo);

            tvResultadoCir.setText("Perímetro: " + perimetro);
            limparCampos();
        } catch (NumberFormatException e) {
            tvResultadoCir.setText("Por favor, insira um valor válido para o raio.");
        }
    }
    private void limparCampos() {
        etRaioCirculo.setText("");
    }
    }
