package maps.service;

import io.micronaut.data.annotation.Query;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import maps.common.LatLngDTO;
import maps.common.Place;
import maps.service.model.LatLng;

@JdbcRepository(dialect = Dialect.H2)
public interface LatLngRepository extends CrudRepository<LatLng, Long> {
//    @Query("select * from latLng l where l.place=:place")
    LatLng find(Place place);
}
