package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDemande is a Querydsl query type for Demande
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDemande extends EntityPathBase<Demande> {

    private static final long serialVersionUID = -1695459032L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDemande demande = new QDemande("demande");

    public final DateTimePath<java.util.Date> dateCreationDemande = createDateTime("dateCreationDemande", java.util.Date.class);

    protected QEmploye employe;

    public final NumberPath<Integer> idDemande = createNumber("idDemande", Integer.class);

    protected QInterface interface1;

    public final StringPath status = createString("status");

    public final ListPath<TicketData, QTicketData> ticketDataList = this.<TicketData, QTicketData>createList("ticketDataList", TicketData.class, QTicketData.class, PathInits.DIRECT2);

    public final ListPath<Validation, QValidation> validationList = this.<Validation, QValidation>createList("validationList", Validation.class, QValidation.class, PathInits.DIRECT2);

    public QDemande(String variable) {
        this(Demande.class, forVariable(variable), INITS);
    }

    public QDemande(Path<? extends Demande> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDemande(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDemande(PathMetadata metadata, PathInits inits) {
        this(Demande.class, metadata, inits);
    }

    public QDemande(Class<? extends Demande> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employe = inits.isInitialized("employe") ? new QEmploye(forProperty("employe"), inits.get("employe")) : null;
        this.interface1 = inits.isInitialized("interface1") ? new QInterface(forProperty("interface1"), inits.get("interface1")) : null;
    }

    public QEmploye employe() {
        if (employe == null) {
            employe = new QEmploye(forProperty("employe"));
        }
        return employe;
    }

    public QInterface interface1() {
        if (interface1 == null) {
            interface1 = new QInterface(forProperty("interface1"));
        }
        return interface1;
    }

}

