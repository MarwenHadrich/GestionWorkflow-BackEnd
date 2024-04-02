package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoleEquipe is a Querydsl query type for RoleEquipe
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoleEquipe extends EntityPathBase<RoleEquipe> {

    private static final long serialVersionUID = 690477533L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoleEquipe roleEquipe = new QRoleEquipe("roleEquipe");

    protected QEmploye employe;

    protected QEquipe equipe;

    protected QRole role;

    protected QRoleEquipePK roleEquipePK;

    public QRoleEquipe(String variable) {
        this(RoleEquipe.class, forVariable(variable), INITS);
    }

    public QRoleEquipe(Path<? extends RoleEquipe> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoleEquipe(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoleEquipe(PathMetadata metadata, PathInits inits) {
        this(RoleEquipe.class, metadata, inits);
    }

    public QRoleEquipe(Class<? extends RoleEquipe> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employe = inits.isInitialized("employe") ? new QEmploye(forProperty("employe"), inits.get("employe")) : null;
        this.equipe = inits.isInitialized("equipe") ? new QEquipe(forProperty("equipe")) : null;
        this.role = inits.isInitialized("role") ? new QRole(forProperty("role")) : null;
        this.roleEquipePK = inits.isInitialized("roleEquipePK") ? new QRoleEquipePK(forProperty("roleEquipePK")) : null;
    }

    public QEmploye employe() {
        if (employe == null) {
            employe = new QEmploye(forProperty("employe"));
        }
        return employe;
    }

    public QEquipe equipe() {
        if (equipe == null) {
            equipe = new QEquipe(forProperty("equipe"));
        }
        return equipe;
    }

    public QRole role() {
        if (role == null) {
            role = new QRole(forProperty("role"));
        }
        return role;
    }

    public QRoleEquipePK roleEquipePK() {
        if (roleEquipePK == null) {
            roleEquipePK = new QRoleEquipePK(forProperty("roleEquipePK"));
        }
        return roleEquipePK;
    }

}

