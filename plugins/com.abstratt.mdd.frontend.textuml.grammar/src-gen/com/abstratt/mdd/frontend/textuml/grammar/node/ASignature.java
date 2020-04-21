/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import java.util.*;
import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ASignature extends PSignature
{
    private TLParen _lParen_;
    private PParamDeclList _paramDeclList_;
    private TRParen _rParen_;
    private POptionalReturnType _optionalReturnType_;
    private POptionalRaisesSection _optionalRaisesSection_;
    private final LinkedList<PParametersetDecl> _parametersetDecl_ = new LinkedList<PParametersetDecl>();

    public ASignature()
    {
        // Constructor
    }

    public ASignature(
        @SuppressWarnings("hiding") TLParen _lParen_,
        @SuppressWarnings("hiding") PParamDeclList _paramDeclList_,
        @SuppressWarnings("hiding") TRParen _rParen_,
        @SuppressWarnings("hiding") POptionalReturnType _optionalReturnType_,
        @SuppressWarnings("hiding") POptionalRaisesSection _optionalRaisesSection_,
        @SuppressWarnings("hiding") List<PParametersetDecl> _parametersetDecl_)
    {
        // Constructor
        setLParen(_lParen_);

        setParamDeclList(_paramDeclList_);

        setRParen(_rParen_);

        setOptionalReturnType(_optionalReturnType_);

        setOptionalRaisesSection(_optionalRaisesSection_);

        setParametersetDecl(_parametersetDecl_);

    }

    @Override
    public Object clone()
    {
        return new ASignature(
            cloneNode(this._lParen_),
            cloneNode(this._paramDeclList_),
            cloneNode(this._rParen_),
            cloneNode(this._optionalReturnType_),
            cloneNode(this._optionalRaisesSection_),
            cloneList(this._parametersetDecl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASignature(this);
    }

    public TLParen getLParen()
    {
        return this._lParen_;
    }

    public void setLParen(TLParen node)
    {
        if(this._lParen_ != null)
        {
            this._lParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lParen_ = node;
    }

    public PParamDeclList getParamDeclList()
    {
        return this._paramDeclList_;
    }

    public void setParamDeclList(PParamDeclList node)
    {
        if(this._paramDeclList_ != null)
        {
            this._paramDeclList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paramDeclList_ = node;
    }

    public TRParen getRParen()
    {
        return this._rParen_;
    }

    public void setRParen(TRParen node)
    {
        if(this._rParen_ != null)
        {
            this._rParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rParen_ = node;
    }

    public POptionalReturnType getOptionalReturnType()
    {
        return this._optionalReturnType_;
    }

    public void setOptionalReturnType(POptionalReturnType node)
    {
        if(this._optionalReturnType_ != null)
        {
            this._optionalReturnType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._optionalReturnType_ = node;
    }

    public POptionalRaisesSection getOptionalRaisesSection()
    {
        return this._optionalRaisesSection_;
    }

    public void setOptionalRaisesSection(POptionalRaisesSection node)
    {
        if(this._optionalRaisesSection_ != null)
        {
            this._optionalRaisesSection_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._optionalRaisesSection_ = node;
    }

    public LinkedList<PParametersetDecl> getParametersetDecl()
    {
        return this._parametersetDecl_;
    }

    public void setParametersetDecl(List<PParametersetDecl> list)
    {
        this._parametersetDecl_.clear();
        this._parametersetDecl_.addAll(list);
        for(PParametersetDecl e : list)
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
            + toString(this._lParen_)
            + toString(this._paramDeclList_)
            + toString(this._rParen_)
            + toString(this._optionalReturnType_)
            + toString(this._optionalRaisesSection_)
            + toString(this._parametersetDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lParen_ == child)
        {
            this._lParen_ = null;
            return;
        }

        if(this._paramDeclList_ == child)
        {
            this._paramDeclList_ = null;
            return;
        }

        if(this._rParen_ == child)
        {
            this._rParen_ = null;
            return;
        }

        if(this._optionalReturnType_ == child)
        {
            this._optionalReturnType_ = null;
            return;
        }

        if(this._optionalRaisesSection_ == child)
        {
            this._optionalRaisesSection_ = null;
            return;
        }

        if(this._parametersetDecl_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(this._paramDeclList_ == oldChild)
        {
            setParamDeclList((PParamDeclList) newChild);
            return;
        }

        if(this._rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

        if(this._optionalReturnType_ == oldChild)
        {
            setOptionalReturnType((POptionalReturnType) newChild);
            return;
        }

        if(this._optionalRaisesSection_ == oldChild)
        {
            setOptionalRaisesSection((POptionalRaisesSection) newChild);
            return;
        }

        for(ListIterator<PParametersetDecl> i = this._parametersetDecl_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParametersetDecl) newChild);
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