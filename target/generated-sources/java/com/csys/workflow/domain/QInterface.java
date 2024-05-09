package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInterface is a Querydsl query type for Interface
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInterface extends EntityPathBase<Interface> {

    private static final long serialVersionUID = -1449610393L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInterface interface$ = new QInterface("interface$");

    public final DateTimePath<java.util.Date> dateCreation = createDateTime("dateCreation", java.util.Date.class);

    public final DateTimePath<java.util.Date> dateModification = createDateTime("dateModification", java.util.Date.class);

    public final ListPath<Demande, QDemande> demandeList = this.<Demande, QDemande>createList("demandeList", Demande.class, QDemande.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idInterface = createNumber("idInterface", Integer.class);

    public final StringPath nomInterface = createString("nomInterface");

    public final ListPath<Ticket, QTicket> ticketList = this.<Ticket, QTicket>createList("ticketList", Ticket.class, QTicket.class, PathInits.DIRECT2);

    protected QWorkflow workflow;

    public QInterface(String variable) {
        this(Interface.class, forVariable(variable), INITS);
    }

    public QInterface(Path<? extends Interface> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInterface(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInterface(PathMetadata metadata, PathInits inits) {
        this(Interface.class, metadata, inits);
    }

    public QInterface(Class<? extends Interface> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.workflow = inits.isInitialized("workflow") ? new QWorkflow(forProperty("workflow")) : null;
    }

    public QWorkflow workflow() {
        if (workflow == null) {
            workflow = new QWorkflow(forProperty("workflow"));
        }
        return workflow;
    }

}

