package kailaine.mobile.atv_10_geometria_03_11.controller;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import kailaine.mobile.atv_10_geometria_03_11.model.Retangulo;

public class GeometriaRetangulo implements IGeometriaController<Retangulo> {

    @Override
    public float calcularArea(Retangulo retangulo) {
        return retangulo.getBase() * retangulo.getAltura();
    }

    @Override
    public float calcularPerimetro(Retangulo retangulo) {
        return 2 * (retangulo.getBase() + retangulo.getAltura());
    }
}
