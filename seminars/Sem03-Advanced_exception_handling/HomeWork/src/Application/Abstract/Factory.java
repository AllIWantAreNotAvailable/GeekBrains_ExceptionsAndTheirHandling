package Application.Abstract;


public interface Factory<M extends ProjectBase> {

    M create();

}
