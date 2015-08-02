/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TTransition extends Token
{
    public TTransition()
    {
        super.setText("transition");
    }

    public TTransition(int line, int pos)
    {
        super.setText("transition");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTransition(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTransition(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTransition text.");
    }
}