package dao;

import model.Material;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IMaterialDAO {

    Material addMaterial(Material material);
    Material getMaterialById(String materialId);
    Material updateMaterialById(String materialId,
                            Consumer<Material> updateFunction);
    Material deleteMaterialById(String materialId);
    List<Material> getAllMaterials();
    List<Material> getMaterialByFilter(Predicate<Material> filter);

}
