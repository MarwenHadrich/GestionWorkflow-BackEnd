package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTicketData is a Querydsl query type for TicketData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTicketData extends EntityPathBase<TicketData> {

    private static final long serialVersionUID = 1699342440L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTicketData ticketData = new QTicketData("ticketData");

    protected QDemande demande;

    public final NumberPath<Integer> idTicketData = createNumber("idTicketData", Integer.class);

    protected QTicket ticket;

    public final StringPath valeurTicket = createString("valeurTicket");

    public QTicketData(String variable) {
        this(TicketData.class, forVariable(variable), INITS);
    }

    public QTicketData(Path<? extends TicketData> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTicketData(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTicketData(PathMetadata metadata, PathInits inits) {
        this(TicketData.class, metadata, inits);
    }

    public QTicketData(Class<? extends TicketData> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.demande = inits.isInitialized("demande") ? new QDemande(forProperty("demande"), inits.get("demande")) : null;
        this.ticket = inits.isInitialized("ticket") ? new QTicket(forProperty("ticket"), inits.get("ticket")) : null;
    }

    public QDemande demande() {
        if (demande == null) {
            demande = new QDemande(forProperty("demande"));
        }
        return demande;
    }

    public QTicket ticket() {
        if (ticket == null) {
            ticket = new QTicket(forProperty("ticket"));
        }
        return ticket;
    }

}

