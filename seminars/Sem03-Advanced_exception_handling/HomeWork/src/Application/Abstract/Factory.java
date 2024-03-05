package Application.Abstract;

/**
 * Абстрактный интерфейс фабрики для создания объектов модели.
 *
 * @param <M> Тип объекта модели, который будет создаваться фабрикой.
 */
public interface Factory<M extends ProjectBase> {

    /**
     * Создает объект модели.
     *
     * @return Созданный объект модели.
     */
    M create();

}
