/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TBangs extends Token
{
    public TBangs()
    {
        super.setText("!!");
    }

    public TBangs(int line, int pos)
    {
        super.setText("!!");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBangs(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBangs(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBangs text.");
    }
}
