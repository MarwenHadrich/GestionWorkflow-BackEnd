package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTypeTicket is a Querydsl query type for TypeTicket
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTypeTicket extends EntityPathBase<TypeTicket> {

    private static final long serialVersionUID = -1794403720L;

    public static final QTypeTicket typeTicket1 = new QTypeTicket("typeTicket1");

    public final NumberPath<Integer> idTypeTicket = createNumber("idTypeTicket", Integer.class);

    public final ListPath<Ticket, QTicket> ticketList = this.<Ticket, QTicket>createList("ticketList", Ticket.class, QTicket.class, PathInits.DIRECT2);

    public final StringPath typeTicket = createString("typeTicket");

    public QTypeTicket(String variable) {
        super(TypeTicket.class, forVariable(variable));
    }

    public QTypeTicket(Path<? extends TypeTicket> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTypeTicket(PathMetadata metadata) {
        super(TypeTicket.class, metadata);
    }

}

