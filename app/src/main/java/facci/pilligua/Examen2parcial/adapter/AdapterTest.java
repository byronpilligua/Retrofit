package facci.pilligua.Examen2parcial.adapter;

import java.util.List;

import facci.pilligua.Examen2parcial.constants.Api;
import facci.pilligua.Examen2parcial.models.ModelTest;
import facci.pilligua.Examen2parcial.services.ServiceTest;
import retrofit2.Call;

public class AdapterTest extends BaseAdapter implements ServiceTest {

    private ServiceTest serviceTest;

    public AdapterTest(){
        super(Api.BASE_URL);
        serviceTest = createService(ServiceTest.class);
    }

    @Override
    public Call<List<ModelTest>> getData() {
        return serviceTest.getData();
    }
}
