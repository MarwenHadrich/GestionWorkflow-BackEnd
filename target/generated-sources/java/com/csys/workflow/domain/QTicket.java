package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTicket is a Querydsl query type for Ticket
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTicket extends EntityPathBase<Ticket> {

    private static final long serialVersionUID = -563051618L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTicket ticket = new QTicket("ticket");

    public final NumberPath<Integer> idTicket = createNumber("idTicket", Integer.class);

    protected QInterface interface1;

    public final NumberPath<Integer> maxLength = createNumber("maxLength", Integer.class);

    public final NumberPath<Integer> minLength = createNumber("minLength", Integer.class);

    public final StringPath nomTicket = createString("nomTicket");

    public final NumberPath<Integer> ordreTicket = createNumber("ordreTicket", Integer.class);

    public final StringPath regleTicket = createString("regleTicket");

    public final ListPath<TicketData, QTicketData> ticketDataList = this.<TicketData, QTicketData>createList("ticketDataList", TicketData.class, QTicketData.class, PathInits.DIRECT2);

    protected QTypeTicket typeTicket;

    public QTicket(String variable) {
        this(Ticket.class, forVariable(variable), INITS);
    }

    public QTicket(Path<? extends Ticket> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTicket(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTicket(PathMetadata metadata, PathInits inits) {
        this(Ticket.class, metadata, inits);
    }

    public QTicket(Class<? extends Ticket> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.interface1 = inits.isInitialized("interface1") ? new QInterface(forProperty("interface1")) : null;
        this.typeTicket = inits.isInitialized("typeTicket") ? new QTypeTicket(forProperty("typeTicket")) : null;
    }

    public QInterface interface1() {
        if (interface1 == null) {
            interface1 = new QInterface(forProperty("interface1"));
        }
        return interface1;
    }

    public QTypeTicket typeTicket() {
        if (typeTicket == null) {
            typeTicket = new QTypeTicket(forProperty("typeTicket"));
        }
        return typeTicket;
    }

}

