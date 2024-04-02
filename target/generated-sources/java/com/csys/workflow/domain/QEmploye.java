package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmploye is a Querydsl query type for Employe
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEmploye extends EntityPathBase<Employe> {

    private static final long serialVersionUID = -575822267L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmploye employe = new QEmploye("employe");

    public final StringPath adresse = createString("adresse");

    public final DatePath<java.util.Date> dateNaissance = createDate("dateNaissance", java.util.Date.class);

    public final ListPath<Demande, QDemande> demandeList = this.<Demande, QDemande>createList("demandeList", Demande.class, QDemande.class, PathInits.DIRECT2);

    public final StringPath emailEmploye = createString("emailEmploye");

    public final NumberPath<Integer> idEmploye = createNumber("idEmploye", Integer.class);

    public final StringPath login = createString("login");

    public final StringPath mdp = createString("mdp");

    public final StringPath nomEmploye = createString("nomEmploye");

    public final StringPath prenomEmploye = createString("prenomEmploye");

    public final ListPath<RoleEquipe, QRoleEquipe> roleEquipeList = this.<RoleEquipe, QRoleEquipe>createList("roleEquipeList", RoleEquipe.class, QRoleEquipe.class, PathInits.DIRECT2);

    public final NumberPath<Integer> tel = createNumber("tel", Integer.class);

    protected QTypeEmploye typeEmploye;

    public final ListPath<Validation, QValidation> validationList = this.<Validation, QValidation>createList("validationList", Validation.class, QValidation.class, PathInits.DIRECT2);

    public QEmploye(String variable) {
        this(Employe.class, forVariable(variable), INITS);
    }

    public QEmploye(Path<? extends Employe> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmploye(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmploye(PathMetadata metadata, PathInits inits) {
        this(Employe.class, metadata, inits);
    }

    public QEmploye(Class<? extends Employe> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.typeEmploye = inits.isInitialized("typeEmploye") ? new QTypeEmploye(forProperty("typeEmploye")) : null;
    }

    public QTypeEmploye typeEmploye() {
        if (typeEmploye == null) {
            typeEmploye = new QTypeEmploye(forProperty("typeEmploye"));
        }
        return typeEmploye;
    }

}

