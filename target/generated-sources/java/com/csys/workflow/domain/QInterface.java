package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import javax.annotation.Generated;


/**
 * QInterface is a Querydsl query type for Interface
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInterface extends EntityPathBase<Interface> {

    private static final long serialVersionUID = -1449610393L;

    public static final QInterface interface$ = new QInterface("interface$");

    public final ListPath<Demande, QDemande> demandeList = this.<Demande, QDemande>createList("demandeList", Demande.class, QDemande.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idInterface = createNumber("idInterface", Integer.class);

    public final StringPath nomInterface = createString("nomInterface");

    public final ListPath<Ticket, QTicket> ticketList = this.<Ticket, QTicket>createList("ticketList", Ticket.class, QTicket.class, PathInits.DIRECT2);

    public final ListPath<Workflow, QWorkflow> workflowList = this.<Workflow, QWorkflow>createList("workflowList", Workflow.class, QWorkflow.class, PathInits.DIRECT2);

    public QInterface(String variable) {
        super(Interface.class, forVariable(variable));
    }

    public QInterface(Path<? extends Interface> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInterface(PathMetadata metadata) {
        super(Interface.class, metadata);
    }

}

