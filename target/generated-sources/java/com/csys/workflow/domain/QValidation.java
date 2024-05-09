package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QValidation is a Querydsl query type for Validation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QValidation extends EntityPathBase<Validation> {

    private static final long serialVersionUID = -433272821L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QValidation validation = new QValidation("validation");

    protected QDemande demande;

    protected QEmploye employe;

    protected QEtape etape;

    public final NumberPath<Integer> idValidation = createNumber("idValidation", Integer.class);

    public final BooleanPath reponse = createBoolean("reponse");

    public QValidation(String variable) {
        this(Validation.class, forVariable(variable), INITS);
    }

    public QValidation(Path<? extends Validation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QValidation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QValidation(PathMetadata metadata, PathInits inits) {
        this(Validation.class, metadata, inits);
    }

    public QValidation(Class<? extends Validation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.demande = inits.isInitialized("demande") ? new QDemande(forProperty("demande"), inits.get("demande")) : null;
        this.employe = inits.isInitialized("employe") ? new QEmploye(forProperty("employe"), inits.get("employe")) : null;
        this.etape = inits.isInitialized("etape") ? new QEtape(forProperty("etape"), inits.get("etape")) : null;
    }

    public QDemande demande() {
        if (demande == null) {
            demande = new QDemande(forProperty("demande"));
        }
        return demande;
    }

    public QEmploye employe() {
        if (employe == null) {
            employe = new QEmploye(forProperty("employe"));
        }
        return employe;
    }

    public QEtape etape() {
        if (etape == null) {
            etape = new QEtape(forProperty("etape"));
        }
        return etape;
    }

}

