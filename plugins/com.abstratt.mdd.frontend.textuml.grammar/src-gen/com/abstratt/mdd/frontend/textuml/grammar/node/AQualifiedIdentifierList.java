/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import java.util.*;
import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AQualifiedIdentifierList extends PQualifiedIdentifierList
{
    private PQualifiedIdentifier _qualifiedIdentifier_;
    private final LinkedList<PQualifiedIdentifierListTail> _qualifiedIdentifierListTail_ = new LinkedList<PQualifiedIdentifierListTail>();

    public AQualifiedIdentifierList()
    {
        // Constructor
    }

    public AQualifiedIdentifierList(
        @SuppressWarnings("hiding") PQualifiedIdentifier _qualifiedIdentifier_,
        @SuppressWarnings("hiding") List<PQualifiedIdentifierListTail> _qualifiedIdentifierListTail_)
    {
        // Constructor
        setQualifiedIdentifier(_qualifiedIdentifier_);

        setQualifiedIdentifierListTail(_qualifiedIdentifierListTail_);

    }

    @Override
    public Object clone()
    {
        return new AQualifiedIdentifierList(
            cloneNode(this._qualifiedIdentifier_),
            cloneList(this._qualifiedIdentifierListTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAQualifiedIdentifierList(this);
    }

    public PQualifiedIdentifier getQualifiedIdentifier()
    {
        return this._qualifiedIdentifier_;
    }

    public void setQualifiedIdentifier(PQualifiedIdentifier node)
    {
        if(this._qualifiedIdentifier_ != null)
        {
            this._qualifiedIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._qualifiedIdentifier_ = node;
    }

    public LinkedList<PQualifiedIdentifierListTail> getQualifiedIdentifierListTail()
    {
        return this._qualifiedIdentifierListTail_;
    }

    public void setQualifiedIdentifierListTail(List<PQualifiedIdentifierListTail> list)
    {
        this._qualifiedIdentifierListTail_.clear();
        this._qualifiedIdentifierListTail_.addAll(list);
        for(PQualifiedIdentifierListTail e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._qualifiedIdentifier_)
            + toString(this._qualifiedIdentifierListTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._qualifiedIdentifier_ == child)
        {
            this._qualifiedIdentifier_ = null;
            return;
        }

        if(this._qualifiedIdentifierListTail_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._qualifiedIdentifier_ == oldChild)
        {
            setQualifiedIdentifier((PQualifiedIdentifier) newChild);
            return;
        }

        for(ListIterator<PQualifiedIdentifierListTail> i = this._qualifiedIdentifierListTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PQualifiedIdentifierListTail) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}