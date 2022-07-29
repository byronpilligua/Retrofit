package facci.pilligua.Examen2parcial.services;

import java.util.List;

import facci.pilligua.Examen2parcial.constants.Api;
import facci.pilligua.Examen2parcial.models.ModelTest;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceTest {

    //LIST
    @GET(Api.URL_GET)
    Call<List<ModelTest>> getData();
}