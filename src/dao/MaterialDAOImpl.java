package dao;

import model.Material;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MaterialDAOImpl implements IMaterialDAO{
    private static final Map<String, Material> materials = new HashMap<>();


    @Override
    public Material addMaterial(Material material) {
        materials.put(material.getMaterialId(), material);
        return material;
    }

    @Override
    public Material getMaterialById(String materialId) {
        return materials.get(materialId);
    }

    @Override
    public Material updateMaterialById(String materialId, Consumer<Material> updateFunction) {
        Material material = materials.get(materialId);
        updateFunction.accept(material);
        return material;
    }

    @Override
    public Material deleteMaterialById(String materialId) {
        Material materialToReturn = materials.get(materialId);
        materials.remove(materialId);
        return materialToReturn;
    }

    @Override
    public List<Material> getAllMaterials() {
        return new ArrayList<>(materials.values());
    }

    @Override
    public List<Material> getMaterialByFilter(Predicate<Material> filter) {
        return materials.values().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }
}
