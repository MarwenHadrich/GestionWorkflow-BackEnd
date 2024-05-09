package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoleEquipePK is a Querydsl query type for RoleEquipePK
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QRoleEquipePK extends BeanPath<RoleEquipePK> {

    private static final long serialVersionUID = 2123948184L;

    public static final QRoleEquipePK roleEquipePK = new QRoleEquipePK("roleEquipePK");

    public final NumberPath<Integer> idEmploye = createNumber("idEmploye", Integer.class);

    public final NumberPath<Integer> idEquipe = createNumber("idEquipe", Integer.class);

    public final NumberPath<Integer> roleEquipe = createNumber("roleEquipe", Integer.class);

    public QRoleEquipePK(String variable) {
        super(RoleEquipePK.class, forVariable(variable));
    }

    public QRoleEquipePK(Path<? extends RoleEquipePK> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleEquipePK(PathMetadata metadata) {
        super(RoleEquipePK.class, metadata);
    }

}

