package kailaine.mobile.atv_10_geometria_03_11.controller;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import kailaine.mobile.atv_10_geometria_03_11.model.Circulo;

public class GeometriaCirculo implements IGeometriaController<Circulo> {

    @Override
    public float calcularArea(Circulo circulo) {
        return (float) (Math.PI * Math.pow(circulo.getRaio(), 2));
    }

    @Override
    public float calcularPerimetro(Circulo circulo) {
        return (float) (2 * Math.PI * circulo.getRaio());
    }
}